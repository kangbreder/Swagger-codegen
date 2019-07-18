//
// GetRolesRoleIdPermissionsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetRolesRoleIdPermissionsResponse: Codable {

    public var _id: Int64?
    public var name: String?
    public var _description: String?
    public var permissionUsageData: [GetRolesRoleIdPermissionsResponsePermissionData]?

    public init(_id: Int64?, name: String?, _description: String?, permissionUsageData: [GetRolesRoleIdPermissionsResponsePermissionData]?) {
        self._id = _id
        self.name = name
        self._description = _description
        self.permissionUsageData = permissionUsageData
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case _description = "description"
        case permissionUsageData
    }


}

