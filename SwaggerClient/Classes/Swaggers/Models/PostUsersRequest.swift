//
// PostUsersRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostUsersRequest: Codable {

    public var username: String?
    public var firstname: String?
    public var lastname: String?
    public var email: String?
    public var officeId: Int64?
    public var staffId: Int64?
    public var roles: String?
    public var sendPasswordToEmail: Bool?
    public var isSelfServiceUser: Bool?

    public init(username: String?, firstname: String?, lastname: String?, email: String?, officeId: Int64?, staffId: Int64?, roles: String?, sendPasswordToEmail: Bool?, isSelfServiceUser: Bool?) {
        self.username = username
        self.firstname = firstname
        self.lastname = lastname
        self.email = email
        self.officeId = officeId
        self.staffId = staffId
        self.roles = roles
        self.sendPasswordToEmail = sendPasswordToEmail
        self.isSelfServiceUser = isSelfServiceUser
    }

    public enum CodingKeys: String, CodingKey { 
        case username
        case firstname
        case lastname
        case email
        case officeId
        case staffId
        case roles = "Roles"
        case sendPasswordToEmail
        case isSelfServiceUser
    }


}
