//
// GetTaxesGroupTaxAssociations.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetTaxesGroupTaxAssociations: Codable {

    public var _id: Int?
    public var taxComponent: GetTaxesGroupTaxComponent?
    public var startDate: Date?

    public init(_id: Int?, taxComponent: GetTaxesGroupTaxComponent?, startDate: Date?) {
        self._id = _id
        self.taxComponent = taxComponent
        self.startDate = startDate
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case taxComponent
        case startDate
    }


}

