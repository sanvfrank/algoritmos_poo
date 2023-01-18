public class targetaDeCredito {
entidadFinanciera entidadFinanciera;
String nombreEntidad;
String numeroTargeta;
Double saldoDisponible;
datosTitular datosTitular;



public targetaDeCredito(entidadFinanciera entidadFinanciera, String nombreEntidad, String numeroTargeta,
        Double saldoDisponible, datosTitular datosTitular) {
    this.entidadFinanciera = entidadFinanciera;
    this.nombreEntidad = nombreEntidad;
    this.numeroTargeta = numeroTargeta;
    this.saldoDisponible = saldoDisponible;
    this.datosTitular = datosTitular;
}

public boolean suficiente(double monto){
    
    return saldoDisponible>=monto;
}
public void descontar(double monto){
    saldoDisponible=saldoDisponible-monto;
}

public String nombreCompleto(){
    return datosTitular.nombreCompleto();
}

@Override
public String toString() {
    return "Datos del cliente\n"+datosTitular+"\n\nDatos de la targeta:\nnombre de la entidad: "+nombreEntidad
    +"\nnumero de la targeta: "+numeroTargeta+"\nEntidad financiera: "+entidadFinanciera+"\nSaldo disponible: "+saldoDisponible;
}




}
