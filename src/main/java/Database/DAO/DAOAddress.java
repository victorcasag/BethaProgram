package Database.DAO;

import Database.Model.modelAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author victor
 */
public class DAOAddress extends AbstractDAO{
    private String queryInsertAddress=
                   "INSERT INTO BETHAPROGRAM.ADRESSES" 
                 + "(SYS_COUNTRY," 
                 + "SYS_STATE," 
                 + "SYS_ZIP_CODE," 
                 + "SYS_STREET," 
                 + "SYS_NUMBER_OF_HOUSE)"
                 + "VALUES"
                 + "(?,?,?,?,?)";
    
    private PreparedStatement PSinsertAddress;
    
    public DAOAddress(final Connection conn) throws SQLException{
        PSinsertAddress = conn.prepareStatement(queryInsertAddress);
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
        modelAddress address = (modelAddress) ao_object;
		
        Set(PSinsertAddress, 1, address.getCountry());
        Set(PSinsertAddress, 2, address.getState());
        Set(PSinsertAddress, 3, address.getNeighborhood());
        Set(PSinsertAddress, 4, address.getZipCode());
        Set(PSinsertAddress, 5, address.getStreet());
        Set(PSinsertAddress, 6, address.getNumberOfHouse());
 
       PSinsertAddress.execute();
    }

    @Override
    public void Update(Object ao_object) throws SQLException {
        
    }

    @Override
    public void Delete(Object ao_object) throws SQLException {
        
    }
    
}
