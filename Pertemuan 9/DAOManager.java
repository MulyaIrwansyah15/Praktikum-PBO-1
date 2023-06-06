/**
 *  File        : DAOManager.java
 *  Nama        : Mulya Irwansyah / 24060121140110
 *  Deskripsi   : Pengelola DAO dalam program
 */

public class DAOManager{
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}