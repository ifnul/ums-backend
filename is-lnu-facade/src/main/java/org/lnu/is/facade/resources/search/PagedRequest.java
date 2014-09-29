package org.lnu.is.facade.resources.search;



public class PagedRequest {

    private Integer offset;
    private Integer limit;

    /**
     * Constructor with parameters.
     * @param offset start position.
     * @param limit limit position.
     */
	public PagedRequest(final Integer offset, final Integer limit) {
		super();
		this.offset = offset;
		this.limit = limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(final Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(final Integer limit) {
		this.limit = limit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((limit == null) ? 0 : limit.hashCode());
		result = prime * result + ((offset == null) ? 0 : offset.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PagedRequest other = (PagedRequest) obj;
		if (limit == null) {
			if (other.limit != null) {
				return false;
			}
		} else if (!limit.equals(other.limit)) {
			return false;
		}
		if (offset == null) {
			if (other.offset != null) {
				return false;
			}
		} else if (!offset.equals(other.offset)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PagedResultRequest [offset=" + offset + ", limit=" + limit
				+ "]";
	}

}
