package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import br.com.caelum.jdbc.ConnectionFactory;

public class JDBCInsere {

        public static void main(String[] args) throws SQLException {
        	
        	// conectando
            Connection con = new ConnectionFactory().getConnection();

//        	try(Connection con = new ConnectionFactory().getConnection()) {
//                // faz um monte de operações.
//                // que podem lançar exceptions runtime e SQLException
//            } catch(SQLException e) {
//                System.out.println(e);
//            }
        	
            // cria um preparedStatement
            String sql = "INSERT INTO contatos" +
                    " (nome,email,endereco,dataNascimento)" +
                    " VALUES (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);

            // preenche os valores
            stmt.setString(1, "Caelum");
            stmt.setString(2, "contato@caelum.com.br");
            stmt.setString(3, "R. Vergueiro 3185 cj57");
            stmt.setDate(4, new java.sql.Date(
                    Calendar.getInstance().getTimeInMillis()));

            // executa
            stmt.execute();
            stmt.close();

            System.out.println("Gravado!");

            con.close();
        }
    }