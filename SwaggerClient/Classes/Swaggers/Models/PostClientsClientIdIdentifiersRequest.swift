//
// PostClientsClientIdIdentifiersRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostClientsClientIdIdentifiersRequest: Codable {

    public var documentTypeId: Int?
    public var documentKey: String?
    public var _description: String?

    public init(documentTypeId: Int?, documentKey: String?, _description: String?) {
        self.documentTypeId = documentTypeId
        self.documentKey = documentKey
        self._description = _description
    }

    public enum CodingKeys: String, CodingKey { 
        case documentTypeId
        case documentKey
        case _description = "description"
    }


}

