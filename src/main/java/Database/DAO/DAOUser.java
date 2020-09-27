package Database.DAO;

import Database.Singleton.Singleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Database.Model.modelUser;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping("daouser")
public class DAOUser extends AbstractDAO{
    private String queryOnlyUser = 
                    "SELECT * FROM "
                  + "ACADEMY_PRIMAL.LOGINS "
                  + "WHERE "
                  + "USERNAME = ? AND "
                  + "PASSWORD = ?";

    private String queryInsertUser=
                    "INSERT INTO BETHAPROGRAM.DATA_USERS"
                  + "(SYS_USERNAME"
                  + "SYS_PASSWORD"
                  + "SYS_NAME"
                  + "SS_LAST_NAME"
                  + "SYS_CPF"
                  + "SYS_CNPJ)"
                  + "VALUES"
                  + "(?,?,?,?,?,?)";
    

    
    private PreparedStatement PSqueryOnlyUser;
    private PreparedStatement PSinsertUsers;
    
    
    public DAOUser(final Connection conn) throws SQLException{
            PSqueryOnlyUser = conn.prepareStatement(queryOnlyUser);
            PSinsertUsers = conn.prepareStatement(queryInsertUser);
            
    }

    public modelUser SelectLogin(final String _user, final String _password) throws SQLException {

            modelUser user = null;

            Set(PSqueryOnlyUser, 1, _user);
            Set(PSqueryOnlyUser, 2, _password);

            ResultSet result = PSqueryOnlyUser.executeQuery();
            if(result.first()) {
                            user = new modelUser();
                            user.setIdUser(result.getInt("IDLOGINS"));
                            user.setUsername(result.getString("USERNAME"));
                            user.setPassword(result.getString("PASSWORD"));
            }
            result.close();

            return user;
    }

    @Override
    public List<Object> Select(Object as_parameter) throws SQLException {
        return null;
    }

    @Override
    public List<Object> SelectWithOutParameter() throws SQLException {
         return null;
    }

    @Override
    public void Insert(Object ao_object) throws SQLException {
        modelUser client = (modelUser) ao_object;
		
        Set(PSinsertUsers, 1, client.getUsername());
        Set(PSinsertUsers, 2, client.getPassword());
        Set(PSinsertUsers, 3, client.getName());
        Set(PSinsertUsers, 4, client.getLastName());
        Set(PSinsertUsers, 5, client.getCpf());
        Set(PSinsertUsers, 6, client.getCnpj());

        PSinsertUsers.execute();
    }
    
    @Override
    public void Update(Object ao_object) throws SQLException {
        
    }

    @Override
    public void Delete(Object ao_object) throws SQLException {
        
    }
}
