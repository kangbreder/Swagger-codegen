//
// GetSelfUserDetailsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetSelfUserDetailsResponse: Codable {

    public var username: String?
    public var userId: Int?
    public var base64EncodedAuthenticationKey: String?
    public var authenticated: Bool?
    public var officeId: Int?
    public var officeName: String?
    public var staffId: Int?
    public var staffDisplayName: String?
    public var organisationalRole: GetSelfUserDetailsOrganisationalRole?
    public var roles: [GetSelfUserDetailsRoles]?
    public var permissions: [String]?
    public var isSelfServiceUser: Bool?
    public var clients: [Int]?

    public init(username: String?, userId: Int?, base64EncodedAuthenticationKey: String?, authenticated: Bool?, officeId: Int?, officeName: String?, staffId: Int?, staffDisplayName: String?, organisationalRole: GetSelfUserDetailsOrganisationalRole?, roles: [GetSelfUserDetailsRoles]?, permissions: [String]?, isSelfServiceUser: Bool?, clients: [Int]?) {
        self.username = username
        self.userId = userId
        self.base64EncodedAuthenticationKey = base64EncodedAuthenticationKey
        self.authenticated = authenticated
        self.officeId = officeId
        self.officeName = officeName
        self.staffId = staffId
        self.staffDisplayName = staffDisplayName
        self.organisationalRole = organisationalRole
        self.roles = roles
        self.permissions = permissions
        self.isSelfServiceUser = isSelfServiceUser
        self.clients = clients
    }


}
