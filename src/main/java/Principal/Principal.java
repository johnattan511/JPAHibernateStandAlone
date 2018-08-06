package Principal;

import DAOImplementacion.DAOImplementacionEstudiante;
import DAOInterface.DAOInterfaceEstudiante;
import POJOS.Estudiante;

public class Principal {
	
   public static void main(String[] args){
	   
	   DAOInterfaceEstudiante dao = new DAOImplementacionEstudiante();
	   
	   // Insert
	   dao.insertar("jonathan", "3012533108", "johnalexander_88@hotmail.com");
	   
	   // Update
       dao.actualizar(1, "pedro", "123456", "hk@hotmail.com");
       
       // Select
	   Estudiante estudiante = dao.consultar(1);
	   System.out.println("La consulta es: " + estudiante);
	   
	   // Delete
	   dao.eliminar(1);
	   
	   // Cerrar Recursos
	   dao.close();

   }
}
