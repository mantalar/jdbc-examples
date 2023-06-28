/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.poliban.roman.jdbc.examples.service;

import id.ac.poliban.roman.jdbc.examples.dao.FriendDao;
import id.ac.poliban.roman.jdbc.examples.helper.JDBCUtils;
import id.ac.poliban.roman.jdbc.examples.model.Friend;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roman
 */
public class FriendServiceViaPreparedStatement implements FriendDao{

    @Override
    public void insert(Friend f) {
        String sql = "insert into friend values(?,?,?,?,?)";
        try(PreparedStatement pst = JDBCUtils.getMySQLConnection().prepareStatement(sql)){
            pst.setNull(1, f.getId());
            pst.setString(2, f.getName());
            pst.setDate(3, Date.valueOf(f.getBirthday()));
            pst.setString(4, f.getAddress());
            pst.setString(5, f.getPhone());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FriendServiceViaPreparedStatement.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public void update(Friend f) {
        String sql = "update friend set name=?, birthday=?, address=?, phone=? where id=?";
        try(PreparedStatement pst = JDBCUtils.getMySQLConnection().prepareStatement(sql)){
            pst.setString(1, f.getName());
            pst.setDate(2, Date.valueOf(f.getBirthday()));
            pst.setString(3, f.getAddress());
            pst.setString(4, f.getPhone());
            pst.setInt(5, f.getId());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FriendServiceViaPreparedStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from friend where id=?";
        try(PreparedStatement pst = JDBCUtils.getMySQLConnection().prepareStatement(sql)){
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FriendServiceViaPreparedStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Friend getAFriendById(int id) {
        Friend result = null;
        String sql = "select * from friend where id=?";
        try(PreparedStatement pst = JDBCUtils.getMySQLConnection().prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
            pst.setInt(1, id);
            try(ResultSet rs = pst.executeQuery()){
                if(rs.first())
                    result = new Friend(
                            rs.getInt(1), 
                            rs.getString(2), 
                             rs.getDate(3) != null? rs.getDate(3).toLocalDate() : null, 
                            rs.getString(4),
                            rs.getString(5)
                    );
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FriendServiceViaPreparedStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public List<Friend> getAllFriends() {
        List<Friend> result = new ArrayList<>();
        String sql = "select * from friend";
        try(PreparedStatement pst = JDBCUtils.getMySQLConnection().prepareStatement(sql); ResultSet rs = pst.executeQuery()){
            while(rs.next())
                result.add(new Friend(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3)!=null? rs.getDate(3).toLocalDate():null,
                        rs.getString(4),
                        rs.getString(5)
                ));
        } catch (SQLException ex) {
            Logger.getLogger(FriendServiceViaPreparedStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
}
