package interview.questions.ocp_java_17;

//Restrict and Controlled Inheritance
public sealed interface Payment permits UPIPayment, CarPayment{
}
