//Ahmir Roney-Watts

import java.util.Scanner;

public class Patient {
	
	private String name;
	private String provider;
	private double costWithoutTax;
	private double costWithTax;
	private double copay;
	
	//default constructors
	
	public Patient()
	{
		this.name = "unknown";
		this.provider = "unknown";
		this.costWithoutTax = 0;
		this.costWithTax = 0;
		this.copay = 0;
	}
	
	//parameterized constructor
	
	public Patient(String xName, String xProvider, double xCostWithoutTax, double xCostWithTax, double xCopay)
	{
		this.setName(xName);
		this.setProvider(xProvider);
		this.setCostWithoutTax(xCostWithoutTax);
		this.setCostWithTax(xCostWithTax);
		this.setCopay(xCopay);
	}
	
	//copy constructor
	
	public Patient(Patient pt)
	{
		this.setName(pt.getName());
		this.setProvider(pt.getProvider());
		this.setCostWithoutTax(pt.getCostWithoutTax());
		this.setCostWithTax(pt.getCostWithTax());
		this.setCopay(pt.getCopay());
	}
	
	//accessors
	
	public String getName()
	{
		return this.name;
	}
	
	public String getProvider()
	{
		return this.provider;
	}
	
	public double getCostWithoutTax()
	{
		return this.costWithoutTax;
	}
	
	public double getCostWithTax()
	{
		return this.costWithTax;
	}
	
	public double getCopay()
	{
		return this.copay;
	}
	
	//mutators
	
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setProvider(String xProvider)
	{
		if( xProvider .equalsIgnoreCase("United Health One") || xProvider .equalsIgnoreCase("Humana") || xProvider .equalsIgnoreCase("Cigna") || xProvider .equalsIgnoreCase("Aetna") || xProvider .equalsIgnoreCase("BCBS"))
		{
		this.provider = xProvider;
		}
		else
		{
			System.out.println("Invalid provider entered!");
		}
	}
	
	public void setCostWithoutTax(double xCostWithoutTax)
	{
		if(xCostWithoutTax >= 0)
		{
			this.costWithoutTax = xCostWithoutTax;	
		}
		else
		{
			System.out.println("Invalid cost! Exiting the program!");
		}
	}		
	
	public void setCostWithTax(double xCostWithTax)
	{
		if(xCostWithTax >= 0)
		{
			this.costWithTax = xCostWithTax;
		}
		else
		{
			System.out.println("Invalid cost! Exiting the program!");
		}
	}
	
	public void setCopay(double xCopay)
	{
		if(xCopay >= 0)
		{
			this.copay = xCopay;
		}
		else
		{
			System.out.println("Invalid copay! Exiting the program!");
		}
	}
	
	//other methods
	
	public boolean equals(Patient pt)
	{
		return this.name.equalsIgnoreCase(pt.getName()) && this.provider.equalsIgnoreCase(pt.getProvider());
	}
	
	public double calculateTaxes(double xCostWithoutTax)
	{
		double tax = 0.08 * xCostWithoutTax;
		
		return this.costWithTax = xCostWithoutTax + tax;
	}
	
	public double calculateCopayAmount(double costWithTax)
	{
		if(costWithTax >= 0 && costWithTax <= 99)
		{
			this.copay = 0;
		}
		else if(costWithTax >= 100 && costWithTax <= 199)
		{
			this.copay = costWithTax/10;
		}
		else if(costWithTax >= 200 && costWithTax <= 299)
		{
			this.copay = costWithTax/5;
		}
		else if(costWithTax >= 300 && costWithTax <= 499)
		{
			this.copay = costWithTax/4;
		}
		else
		{
			this.copay = costWithTax * 0.35;
		}
		
		return this.copay;
	}
	
	public void print()
	{
		System.out.println("Final Bill: \nPatient: "+this.name+"\nHealth Insurance Provider: "+this.provider+"\nCost before tax: $"+this.costWithoutTax+"\nFinal Bill Amount: $"+this.costWithTax+"\nPatient's Copay Amount: $"+this.copay);
	}

}
