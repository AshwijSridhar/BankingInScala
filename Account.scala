package week2.Banking

import java.time.temporal.TemporalAmount

class Account(val customer: Customer,val id:String) {

  private val Balance:Int = 0
 customer.addAccount(this)

  def balance = Balance
  def deposit(amount:Int):Boolean={
      if(amount<0)false
      else
        balance+= amount
        true
  }

  def withdraw(amount:Int):Boolean ={
    if(amount < 0 || amount > Balance)false
    else
      balance-= amount
     true
  }


}
