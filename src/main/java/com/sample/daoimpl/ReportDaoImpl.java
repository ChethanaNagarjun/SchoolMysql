package com.sample.daoimpl;

import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.sample.dao.ReportDao;
import com.sample.model.Report;

@Repository
@Transactional
public class ReportDaoImpl extends BaseDaoImpl implements ReportDao {
	@Override
	public Integer save(Report report) throws Throwable {
		return (Integer) getSession().save(report);
	}

	@Override
	public Report getById(Integer id) throws Throwable {
		try {
			Criteria criteria = getSession().createCriteria(Report.class).add(Restrictions.eq("id", id));
			if (criteria.list().isEmpty()) {
				return null;
			}
			return (Report) criteria.list().get(0);
		} catch (Throwable ex) {
			throw new Throwable(ex);
		}

	}

	@Override
	public Report getByStudentId(Integer studentId) throws Throwable {
		try {
			Criteria criteria = getSession().createCriteria(Report.class).add(Restrictions.eq("studentId", studentId));
			if (criteria.list().isEmpty()) {
				return null;
			}
			return (Report) criteria.list().get(0);
		} catch (Throwable ex) {
			throw new Throwable(ex);
		}

	}

	public Report getByReportStatus(String reportStatus) throws Throwable {
		try {
			Criteria criteria = getSession().createCriteria(Report.class)
					.add(Restrictions.eq("reportSatus", reportStatus));
			if (criteria.list().isEmpty()) {
				return null;
			}
			return (Report) criteria.list().get(0);
		} catch (Throwable ex) {
			throw new Throwable(ex);
		}

	}

	@Override
	public void delete(Report report) throws Throwable {
		getSession().delete(report);
	}

	@Override
	public void update(Report report) throws Throwable {
		getSession().update(report);
	}

	@Override
	public List<Report> getAll() throws Throwable {
		try {
			Criteria criteria = getSession().createCriteria(Report.class);
			List<Report> list = criteria.list();
			if (criteria.list().isEmpty()) {
				return null;
			}

			return list;

		} catch (Throwable ex) {
			throw new Throwable(ex);
		}
	}

}
