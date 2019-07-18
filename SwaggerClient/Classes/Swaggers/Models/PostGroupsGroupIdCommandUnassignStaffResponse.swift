//
// PostGroupsGroupIdCommandUnassignStaffResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostGroupsGroupIdCommandUnassignStaffResponse: Codable {

    public var officeId: Int?
    public var groupId: Int?
    public var resourceId: Int?
    public var changes: PostGroupsGroupIdCommandUnassignStaffChanges?

    public init(officeId: Int?, groupId: Int?, resourceId: Int?, changes: PostGroupsGroupIdCommandUnassignStaffChanges?) {
        self.officeId = officeId
        self.groupId = groupId
        self.resourceId = resourceId
        self.changes = changes
    }


}
