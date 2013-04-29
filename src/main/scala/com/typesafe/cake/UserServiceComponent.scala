package com.typesafe.cake

trait UserServiceComponent {
  this: UserRepositoryComponent =>

  val userService: UserService

  class UserService {
    def getUserRepository = userRepository
  }

}