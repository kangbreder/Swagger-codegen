//
// GetClientsDocumentType.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetClientsDocumentType: Codable {

    public var _id: Int?
    public var name: String?

    public init(_id: Int?, name: String?) {
        self._id = _id
        self.name = name
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
    }


}

