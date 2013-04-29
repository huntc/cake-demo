package com.typesafe.cake

import org.specs2.mutable._
import org.specs2.mock.Mockito
import org.specs2.specification.Scope

class UserServiceSpec extends Specification with Mockito {

  trait TestingEnvironment extends Scope

  with UserServiceComponent
  with UserRepositoryComponent {

    val userRepository = mock[UserRepository]
    val userService = new UserService
  }

  "The user service" should {
    " have a user repository" in new TestingEnvironment {
      userService.getUserRepository must not be null
    }
  }
}
