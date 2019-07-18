//
// DateTimeZone.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct DateTimeZone: Codable {

    public var fixed: Bool?
    public var _id: String?

    public init(fixed: Bool?, _id: String?) {
        self.fixed = fixed
        self._id = _id
    }

    public enum CodingKeys: String, CodingKey { 
        case fixed
        case _id = "id"
    }


}

