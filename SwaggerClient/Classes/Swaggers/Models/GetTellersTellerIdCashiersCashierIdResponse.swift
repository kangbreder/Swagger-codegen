//
// GetTellersTellerIdCashiersCashierIdResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetTellersTellerIdCashiersCashierIdResponse: Codable {

    public var _id: Int64?
    public var tellerId: Int64?
    public var staffId: Int64?
    public var _description: String?
    public var startDate: Date?
    public var endDate: Date?
    public var isFullDay: Bool?
    public var startTime: String?
    public var endTime: String?
    public var tellerName: String?
    public var staffName: String?

    public init(_id: Int64?, tellerId: Int64?, staffId: Int64?, _description: String?, startDate: Date?, endDate: Date?, isFullDay: Bool?, startTime: String?, endTime: String?, tellerName: String?, staffName: String?) {
        self._id = _id
        self.tellerId = tellerId
        self.staffId = staffId
        self._description = _description
        self.startDate = startDate
        self.endDate = endDate
        self.isFullDay = isFullDay
        self.startTime = startTime
        self.endTime = endTime
        self.tellerName = tellerName
        self.staffName = staffName
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case tellerId
        case staffId
        case _description = "description"
        case startDate
        case endDate
        case isFullDay
        case startTime
        case endTime
        case tellerName
        case staffName
    }


}

