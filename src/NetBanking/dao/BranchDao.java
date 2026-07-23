package NetBanking.dao;

import NetBanking.config.DbConnect;
import NetBanking.model.Branch;
import NetBanking.util.GenerateId;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BranchDao {

    public Branch addBranch(String ifscCode, String address) throws SQLException {
        String query = """
                insert into branches (id, ifsc_code, address) values (?, ?, ?)
                """;
        try(Connection con = DbConnect.getConn();
            PreparedStatement statement = con.prepareStatement(query)
        ){
            String id = GenerateId.generateBranchId();
            statement.setString(1, id);
            statement.setString(2, ifscCode);
            statement.setString(3, address);

            statement.executeUpdate();

            Branch branch = findById(id);
            if(branch == null){
                throw new SQLException("Failed to find Branch");
            }
            return branch;
        }
    }


    public Branch findById(String id) throws SQLException{
        String query = "select * from branches where id = ?";
        try(Connection con = DbConnect.getConn();
            PreparedStatement statement = con.prepareStatement(query)){
            statement.setString(1, id);
            try(ResultSet result = statement.executeQuery()){
                return result.next() ? map(result) : null;
            }
        }
    }

    public Branch selectBranch(int index) throws SQLException{
        int offset = index-1;
        String query = "select * from branches order by created_at asc limit ? offset ?";
        try(Connection con = DbConnect.getConn();
            PreparedStatement statement = con.prepareStatement(query)){
            statement.setInt(1, index);
            statement.setInt(2, offset);

            try(ResultSet result = statement.executeQuery()){
                return result.next() ? map(result) : null;
            }
        }
    }



    public List<Branch> findAll() throws SQLException{
        String query = "select * from branches order by created_at asc";
        List<Branch> branches = new ArrayList<>();
        try(Connection con = DbConnect.getConn();
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet result = statement.executeQuery();
        ){
            while(result.next()){
                branches.add(map(result));
            }
        }
        return branches;
    }

    private Branch map(ResultSet result) throws SQLException {
        Timestamp createdAt = result.getTimestamp("created_At");

        return new Branch(
                result.getString("id"),
                result.getString("ifsc_code"),
                result.getString("address"),
                createdAt.toLocalDateTime()
        );
    }
}
