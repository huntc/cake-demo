package com.typesafe.cake

import com.typesafe.cake.mydb.MyDbUserRepositoryComponent

object Application
  extends UserServiceComponent
  with MyDbUserRepositoryComponent {

  val userService = new UserService

  def main(args: Array[String]) {
    if (userService.getUserRepository != null) {
      println("All is well")
    }
  }
}
