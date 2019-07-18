//
// GetCodesResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetCodesResponse: Codable {

    public var _id: Int64?
    public var name: String?
    public var systemDefined: Bool?

    public init(_id: Int64?, name: String?, systemDefined: Bool?) {
        self._id = _id
        self.name = name
        self.systemDefined = systemDefined
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case systemDefined
    }


}

