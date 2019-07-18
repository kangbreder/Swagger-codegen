//
// PutTellersResponseChanges.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutTellersResponseChanges: Codable {

    public var _description: String?
    public var endDate: Date?
    public var startDate: Date?
    public var locale: String?
    public var dateFormat: String?

    public init(_description: String?, endDate: Date?, startDate: Date?, locale: String?, dateFormat: String?) {
        self._description = _description
        self.endDate = endDate
        self.startDate = startDate
        self.locale = locale
        self.dateFormat = dateFormat
    }

    public enum CodingKeys: String, CodingKey { 
        case _description = "description"
        case endDate
        case startDate
        case locale
        case dateFormat
    }


}

