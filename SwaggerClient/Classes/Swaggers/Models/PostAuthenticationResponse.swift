//
// PostAuthenticationResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostAuthenticationResponse: Codable {

    public var username: String?
    public var userId: Int64?
    public var base64EncodedAuthenticationKey: String?
    public var authenticated: Bool?
    public var officeId: Int64?
    public var officeName: String?
    public var staffId: Int64?
    public var staffDisplayName: String?
    public var organisationalRole: EnumOptionData?
    public var roles: [RoleData]?
    public var permissions: [String]?

    public init(username: String?, userId: Int64?, base64EncodedAuthenticationKey: String?, authenticated: Bool?, officeId: Int64?, officeName: String?, staffId: Int64?, staffDisplayName: String?, organisationalRole: EnumOptionData?, roles: [RoleData]?, permissions: [String]?) {
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
    }


}
