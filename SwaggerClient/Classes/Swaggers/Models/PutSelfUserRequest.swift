//
// PutSelfUserRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutSelfUserRequest: Codable {

    public var password: String?
    public var repeatPassword: String?

    public init(password: String?, repeatPassword: String?) {
        self.password = password
        self.repeatPassword = repeatPassword
    }


}
