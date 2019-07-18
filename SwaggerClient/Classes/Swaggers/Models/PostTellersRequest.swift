//
// PostTellersRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostTellersRequest: Codable {

    public enum Status: String, Codable { 
        case invalid = "INVALID"
        case pending = "PENDING"
        case active = "ACTIVE"
        case inactive = "INACTIVE"
        case closed = "CLOSED"
    }
    public var officeId: Int64?
    public var name: String?
    public var _description: String?
    public var status: Status?
    public var locale: String?
    public var dateFormat: String?
    public var startDate: Date?

    public init(officeId: Int64?, name: String?, _description: String?, status: Status?, locale: String?, dateFormat: String?, startDate: Date?) {
        self.officeId = officeId
        self.name = name
        self._description = _description
        self.status = status
        self.locale = locale
        self.dateFormat = dateFormat
        self.startDate = startDate
    }

    public enum CodingKeys: String, CodingKey { 
        case officeId
        case name
        case _description = "description"
        case status
        case locale
        case dateFormat
        case startDate
    }


}
