//
// PostClientsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostClientsResponse: Codable {

    public var officeId: Int?
    public var groupId: Int?
    public var clientId: Int?
    public var resourceId: Int?

    public init(officeId: Int?, groupId: Int?, clientId: Int?, resourceId: Int?) {
        self.officeId = officeId
        self.groupId = groupId
        self.clientId = clientId
        self.resourceId = resourceId
    }


}

