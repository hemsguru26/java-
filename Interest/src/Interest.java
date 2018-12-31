
interface interest {
	
	public float ratecalc(float rate);

}
class Account implements interest
{
	int accid;
	String acname;
	float balance=5000f;
	Account()
	{
		accid=1000;
		acname="xxx";
	}
	public float ratecalc(float rate)
	{
		return balance=balance+(balance*(rate/100));
	}
	void disp()
	{
		System.out.println("account id="+accid);
		System.out.println("account name="+acname);
		System.out.println("account balance="+ratecalc(12));
		
	}
	public static void main(String args[])
	{
		Account obj=new Account();
		obj.disp();
	}
}
