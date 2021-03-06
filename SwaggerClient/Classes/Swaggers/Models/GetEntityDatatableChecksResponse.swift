//
// GetEntityDatatableChecksResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetEntityDatatableChecksResponse: Codable {

    public var _id: Int64?
    public var entity: String?
    public var status: EnumOptionData?
    public var datatableName: String?
    public var systemDefined: Bool?
    public var order: Int64?
    public var productId: Int64?
    public var productName: String?

    public init(_id: Int64?, entity: String?, status: EnumOptionData?, datatableName: String?, systemDefined: Bool?, order: Int64?, productId: Int64?, productName: String?) {
        self._id = _id
        self.entity = entity
        self.status = status
        self.datatableName = datatableName
        self.systemDefined = systemDefined
        self.order = order
        self.productId = productId
        self.productName = productName
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case entity
        case status
        case datatableName
        case systemDefined
        case order
        case productId
        case productName
    }


}

