//
// CashierData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct CashierData: Codable {

    public var _id: Int64?
    public var tellerId: Int64?
    public var officeId: Int64?
    public var staffId: Int64?
    public var _description: String?
    public var startDate: Date?
    public var endDate: Date?
    public var startTime: String?
    public var endTime: String?
    public var officeName: String?
    public var tellerName: String?
    public var staffName: String?
    public var fullDay: Bool?

    public init(_id: Int64?, tellerId: Int64?, officeId: Int64?, staffId: Int64?, _description: String?, startDate: Date?, endDate: Date?, startTime: String?, endTime: String?, officeName: String?, tellerName: String?, staffName: String?, fullDay: Bool?) {
        self._id = _id
        self.tellerId = tellerId
        self.officeId = officeId
        self.staffId = staffId
        self._description = _description
        self.startDate = startDate
        self.endDate = endDate
        self.startTime = startTime
        self.endTime = endTime
        self.officeName = officeName
        self.tellerName = tellerName
        self.staffName = staffName
        self.fullDay = fullDay
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case tellerId
        case officeId
        case staffId
        case _description = "description"
        case startDate
        case endDate
        case startTime
        case endTime
        case officeName
        case tellerName
        case staffName
        case fullDay
    }


}
