
public class Main {

	public static void main(String[] args) {
		
		//DATOS------------------------------------------------------------------------------------DATOS
		final String nombreEmpresa = "Distribuidora TupperWare";
		
		double costoUnidad = 30; // Q45.00
		int cantidadProducto = 100;
		double totalApagar = costoUnidad * cantidadProducto; // Q
		final double precioVenta = 60; // Q60.00
		final double IVA = 0.12; // 12%
		double totalIvaPorUnidad = precioVenta * IVA;
		//------------------------------------------------------------------------------------------
		
		//FUNCIONAMIENTO---------------------------------------------------------------------FUNCIONAMIENTO
		System.out.println("Costo por unidad: Q" + costoUnidad);
		System.out.println("Cantidad de producto: " + cantidadProducto);
		System.out.println("--------------------------------");
		System.out.println("Total: Q" + totalApagar);
		System.out.println("Venderse a: Q"+ precioVenta);
		System.out.println("Impuesto establecido: Q" + IVA);
		System.out.println("Impuesto por unidad: Q" + totalIvaPorUnidad);
		System.out.println("--------------------------------");
		System.out.println();
		System.out.println();
		//-----------------------------------------------------------------------------------------------
		
		
		
		//DATOS 2----------------------------------------------------------------------------------DATOS 2
		int cantidadProductoVendido = 40; 
		double TotalCobradoSinDescuento =cantidadProductoVendido * precioVenta;
		double totalConDescuento = 0;
		double tipoDeDescuento = 0;
		double impuestoTotalAdeclarar = totalConDescuento * IVA;
		double ganancias = (TotalCobradoSinDescuento - (cantidadProductoVendido*costoUnidad) - impuestoTotalAdeclarar);
		//------------------------------------------------------------------------------------------------
		
		//FUNCIONAMIENTO 2-------------------------------------------------------------------FUNCIONAMIENTO 2
		if(cantidadProductoVendido>=50) {
			tipoDeDescuento = 0.05;
			totalConDescuento = TotalCobradoSinDescuento - (TotalCobradoSinDescuento);
		}
		if(cantidadProductoVendido>=100) {
			tipoDeDescuento = 0.15;
			totalConDescuento = TotalCobradoSinDescuento - (TotalCobradoSinDescuento);
		}
		if(cantidadProductoVendido>=100) {
			tipoDeDescuento = 0.25;
			totalConDescuento = TotalCobradoSinDescuento - (TotalCobradoSinDescuento);
		}
		
		System.out.println("Cantidad vendida: "+ cantidadProductoVendido); 
		System.out.println("Total sin descuento: Q"+TotalCobradoSinDescuento); 
		System.out.println("Total con descuento: Q"+ totalConDescuento); 
		System.out.println("IVA a declarar; Q"+ impuestoTotalAdeclarar);
		System.out.println("Tipo de descuento "+tipoDeDescuento);
		System.out.println("--------------------------------");
		System.out.println("Ganancia: Q"+ ganancias); 
		//--------------------------------------------------------------------------------------------------------
		
		
		
		
		
	}

}
