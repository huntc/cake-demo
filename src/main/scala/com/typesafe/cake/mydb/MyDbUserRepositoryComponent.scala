package com.typesafe.cake.mydb

import com.typesafe.cake.UserRepositoryComponent

trait MyDbUserRepositoryComponent extends UserRepositoryComponent {
  val userRepository = new MyDbUserRepository

  class MyDbUserRepository extends UserRepository

}