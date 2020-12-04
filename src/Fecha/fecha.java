package Fecha;

//Clase Fecha
public class fecha {
    private int dia;
    private int mes;
    private int año;
    //Contructor clase fecha
    public fecha(){

    }

    public fecha (int dia,int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    //Getters y setters

    public void setDia(int d){
        dia = d;
    }
    public void setMes(int m){
        mes = m;
    }
    public void setAño(int a){
        año = a;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAño(){
        return año;
    }
    public boolean fechaBien(){
        boolean diaOK, mesOK, añoOK;
        añoOK = año>0;
        mesOK = mes>0 && mes<=12;
        switch (mes){
            case 1://Enero 
            diaOK = dia >= 1 && dia <= 31;
            case 2://Febrero
            if (bisiesto()){
                diaOK = dia >= 1 && dia <=29;
            }  
            else {
                diaOK = dia >=1 && dia <=28;
            }
            case 3://Marzo
            diaOK = dia >= 1 && dia <=31;
            case 4://Abril
            diaOK = dia >= 1 && dia <=30;
            case 5://Mayo
            diaOK = dia >= 1 && dia <=31;
            case 6://Junio
            diaOK = dia >= 1 && dia <=30;
            case 7://Julio
            diaOK = dia >= 1 && dia <=31;
            case 8://Agosto
            diaOK = dia >= 1 && dia <=31;
            case 9://Septiembre
            diaOK = dia >= 1 && dia <=30;
            case 10://Octubre
            diaOK = dia >= 1 && dia <=31;
            case 11://Noviembre
            diaOK = dia >= 1 && dia <=30;
            default://Diciembre
            diaOK = dia >= 1 && dia <=31;                     

        }
        return diaOK && mesOK && añoOK;

    }
    //Metodo comprueba año bisiesto
    public boolean bisiesto() {
        return (año%4==0);
    }
    //Método toString para mostrar la fecha
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (dia < 10) {
            sb.append("0");
        }
        sb.append(dia);
        sb.append("-");
        if (mes < 10) {
            sb.append("0");
        }
        sb.append(mes);
        sb.append("-");
        sb.append(año);
        return sb.toString();
    }

}
