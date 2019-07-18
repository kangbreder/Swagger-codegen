//
// PostHolidaysRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostHolidaysRequest: Codable {

    public var name: String?
    public var _description: String?
    public var dateFormat: String?
    public var locale: String?
    public var fromDate: Date?
    public var toDate: Date?
    public var repaymentsRescheduledTo: Date?
    public var offices: [PostHolidaysRequestOffices]?

    public init(name: String?, _description: String?, dateFormat: String?, locale: String?, fromDate: Date?, toDate: Date?, repaymentsRescheduledTo: Date?, offices: [PostHolidaysRequestOffices]?) {
        self.name = name
        self._description = _description
        self.dateFormat = dateFormat
        self.locale = locale
        self.fromDate = fromDate
        self.toDate = toDate
        self.repaymentsRescheduledTo = repaymentsRescheduledTo
        self.offices = offices
    }

    public enum CodingKeys: String, CodingKey { 
        case name
        case _description = "description"
        case dateFormat
        case locale
        case fromDate
        case toDate
        case repaymentsRescheduledTo
        case offices
    }


}
