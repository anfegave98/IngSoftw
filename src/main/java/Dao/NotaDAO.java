/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Nota;
import util.DbUtil;


/**
 *
 * @author Gibran
 */
public class NotaDAO {
    
    private Connection connection;

    public NotaDAO() throws SQLException, URISyntaxException {
        connection = DbUtil.getConnection();
    }
    

}
