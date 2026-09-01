
	package in.co.rays.basic.Exercise;

	public class AndOperator {
	    public static void main(String[] args) {
	        
	        // Requirements for a discount: Must be a student AND have a coupon
	        boolean isStudent = true;
	        boolean hasCoupon = true;

	        // Both conditions must evaluate to true
	        if (isStudent && hasCoupon) {
	            System.out.println("Congratulations! You get a 20% discount.");
	        } else {
	            System.out.println("Regular price applies. You must be a student with a coupon.");
	        }
	        
	    }
	}

