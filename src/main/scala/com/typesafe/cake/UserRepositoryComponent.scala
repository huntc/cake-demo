package com.typesafe.cake

trait UserRepositoryComponent {
  val userRepository: UserRepository

  trait UserRepository

}