package day11;

public class Account {
		double initial_amount=10000;
		double withdraw=4000;
		double deposit=500;

		void details(){
			System.out.println("The current amount in the account is:"+(initial_amount));
			System.out.println("Withdrawal amount is:"+(withdraw));
			System.out.println("The current amount is(after withdrawal):"+(initial_amount-withdraw));
			System.out.println("Deposit amount is:"+(deposit));
			System.out.println("The current amount in the account is(after deposit):"+(initial_amount-withdraw+deposit));
			System.out.println("--------------------------------------------");
		}
		public Account() {

		}
		void details1(double withdraw,double deposit){
			System.out.println("The current amount in the account is:"+(initial_amount));
			System.out.println("Withdrawal amount is:"+(withdraw));
			System.out.println("The current amount is(after withdrawal):"+(initial_amount-withdraw));
			System.out.println("Deposit amount is:"+(deposit));
			System.out.println("The current amount in the account is(after deposit):"+(initial_amount-withdraw+deposit));
		}
		public Account(double withdraw,double deposit) {
				this.withdraw=withdraw;
				this.deposit=deposit;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Account obj=new Account();
			obj.details();
			obj.details1(4000, 500);
		}

	}
