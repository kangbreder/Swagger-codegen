//
// GetFloatingRatesRatePeriods.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetFloatingRatesRatePeriods: Codable {

    public var _id: Int?
    public var fromDate: String?
    public var interestRate: Double?
    public var isDifferentialToBaseLendingRate: Bool?
    public var isActive: Bool?
    public var createdBy: String?
    public var createdOn: String?
    public var modifiedBy: String?
    public var modifiedOn: String?

    public init(_id: Int?, fromDate: String?, interestRate: Double?, isDifferentialToBaseLendingRate: Bool?, isActive: Bool?, createdBy: String?, createdOn: String?, modifiedBy: String?, modifiedOn: String?) {
        self._id = _id
        self.fromDate = fromDate
        self.interestRate = interestRate
        self.isDifferentialToBaseLendingRate = isDifferentialToBaseLendingRate
        self.isActive = isActive
        self.createdBy = createdBy
        self.createdOn = createdOn
        self.modifiedBy = modifiedBy
        self.modifiedOn = modifiedOn
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case fromDate
        case interestRate
        case isDifferentialToBaseLendingRate
        case isActive
        case createdBy
        case createdOn
        case modifiedBy
        case modifiedOn
    }


}

