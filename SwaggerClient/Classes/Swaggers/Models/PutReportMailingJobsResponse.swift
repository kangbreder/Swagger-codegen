//
// PutReportMailingJobsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutReportMailingJobsResponse: Codable {

    public var resourceId: Int64?
    public var changes: PutReportMailingJobsResponseChanges?

    public init(resourceId: Int64?, changes: PutReportMailingJobsResponseChanges?) {
        self.resourceId = resourceId
        self.changes = changes
    }


}

