//
// GetRolesRoleIdPermissionsResponsePermissionData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetRolesRoleIdPermissionsResponsePermissionData: Codable {

    public var grouping: String?
    public var code: String?
    public var entityName: String?
    public var actionName: String?
    public var selected: Bool?

    public init(grouping: String?, code: String?, entityName: String?, actionName: String?, selected: Bool?) {
        self.grouping = grouping
        self.code = code
        self.entityName = entityName
        self.actionName = actionName
        self.selected = selected
    }


}

