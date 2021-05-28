public class test {
	public static void main(String[] args) {
		ListaEnlazada<Integer> nlista= new ListaEnlazada<Integer>();
		ListaEnlazada<User> nlistaUser= new ListaEnlazada<User>();

		nlista.Agregar(3);
		nlista.Agregar(4);
		nlista.Agregar(23);
		
		//nlista.ObtainNumbersMultipleN(2);
		
		nlista.InserttoMidle(7);
		nlista.printList();
		
		
		nlistaUser.Agregar(new User("carlos",33));
		nlistaUser.Agregar(new User("pepe",37));

		
	}

}

