package com.sapient.lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx01 {
	public static void main(String[] args) {
		
		List<Account> list = List.of(
				new Account(101, 1234.0, "Harry", "male"), 
				new Account(45, 5656.0, "Peter", "male"),
				new Account(66, 7888.0, "Becky", "female"),
				new Account(88, 1221.0, "Mony", "male"),
				new Account(34, 8989.0, "Minnie", "female"),
				new Account(12, 9090.0, "Arnold", "male")
			); 
		
		
		List<Account> onlyMales = AccountPredicate.filterAccounts(list, AccountPredicate.onlyMale()); 
		System.out.println("Only Male Account Holder... ");
		onlyMales.forEach(System.out :: println);
		
		// list people with balance more than 4000 
		
		List<Account> gtThan = AccountPredicate.filterAccounts(list, AccountPredicate.gtBalance());
		System.out.println("Balance Greater than 4k ");
		gtThan.forEach(System.out :: println);
		
		
		// get details of greater than 4000 and males 
		System.out.println("get details of greater than 4000 and males");
		Predicate<Account> onlyMaleAndGreatherThan = AccountPredicate.onlyMale().and(AccountPredicate.gtBalance());
		
		AccountPredicate.filterAccounts(list, onlyMaleAndGreatherThan)
			.forEach(System.out :: println);
		
		System.out.println("----- list only female --------");
		Predicate<Account> onlyFemale = AccountPredicate.onlyMale().negate();
		
		AccountPredicate.filterAccounts(list, onlyFemale)
			.forEach(System.out :: println);
		
		
	}
	
	
	static class AccountPredicate {
		public static Predicate<Account> onlyMale() {
			return acc -> acc.getGender().equals("male");
		}
		
		
		public static Predicate<Account> gtBalance() {
			return acc -> acc.getBalance() > 4000;
		}

		public static List<Account> filterAccounts (List<Account> list,  Predicate<Account>  predicate) {
			return list.stream().filter(predicate).collect(Collectors.toList()); 
		}
	}
	
}













