public class ComplexeMA extends Complexe{
private double argument, module;


public ComplexeMA (double module, double argument){
this.module= module;
this.argument=argument;
}
public ComplexeMA (Complexe c ){
this.argument = getArg();
this.module = getMod();

}


    public  double getReel(){
    return module * Math.cos(argument);
    };

    public  double getImaginaire(){
    return module * Math.sin(argument);
    };

    public double getMod(){
    return this.module;
    };

    public double getArg(){
    return this.argument;
    };

    public Complexe plus(Complexe c){
    if (c instanceof ComplexeRI) {
        return new ComplexeMA(c.plus(this));
    }
    return (ComplexeMA)(new ComplexeRI((this)).plus(c));
    };

    public Complexe moins(Complexe c){
    return (Complexe)(new ComplexeRI(this).moins(c));
    };
    public Complexe multipliePar(Complexe c){

    };
    public Complexe divisePar(Complexe c){

    };
    public  Complexe conjugue(){

    };
    public  Complexe puissance(double x){

    };
    public  Complexe ln(){

    };
    public  String toString(){

    };

}
