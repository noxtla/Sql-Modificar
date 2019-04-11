public void btnUpdate () {
		
		Connection laConexionInsertar = null;
		
		try {
			laConexionInsertar = getConnection();
			ps = laConexionInsertar.prepareStatement("update persona set clave=?,nombre=? where idPersona=?");
			ps.setString(1, cajaClave.getText());
			
			///Esto es nuevo
			ps.setInt(8, Integer.parseInt(cajaID.getTExt() ));
			
			///Aqui solo indicamos. No ejecutamos nada
			
			int resultado = ps.executeUpdate(); ///Ejecutamos la modificacion 
			
			if (resultado>0) {
			///Exito
		}
			else {
				///No exito
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
