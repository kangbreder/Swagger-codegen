//
// PostCodeValuesDataRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostCodeValuesDataRequest: Codable {

    public var name: String?
    public var _description: String?
    public var position: Int?

    public init(name: String?, _description: String?, position: Int?) {
        self.name = name
        self._description = _description
        self.position = position
    }

    public enum CodingKeys: String, CodingKey { 
        case name
        case _description = "description"
        case position
    }


}

