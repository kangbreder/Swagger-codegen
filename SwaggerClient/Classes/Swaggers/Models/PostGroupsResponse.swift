//
// PostGroupsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostGroupsResponse: Codable {

    public var officeId: Int?
    public var groupId: Int?
    public var resourceId: Int?

    public init(officeId: Int?, groupId: Int?, resourceId: Int?) {
        self.officeId = officeId
        self.groupId = groupId
        self.resourceId = resourceId
    }


}
