//
// PutTellersTellerIdCashiersCashierIdResponseChanges.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutTellersTellerIdCashiersCashierIdResponseChanges: Codable {

    public var endDate: Date?
    public var _description: String?
    public var locale: String?
    public var dateFormat: String?

    public init(endDate: Date?, _description: String?, locale: String?, dateFormat: String?) {
        self.endDate = endDate
        self._description = _description
        self.locale = locale
        self.dateFormat = dateFormat
    }

    public enum CodingKeys: String, CodingKey { 
        case endDate
        case _description = "description"
        case locale
        case dateFormat
    }


}
