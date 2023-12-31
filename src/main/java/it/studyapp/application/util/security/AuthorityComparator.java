package it.studyapp.application.util.security;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.util.Assert;

public class AuthorityComparator implements Comparator<GrantedAuthority>, Serializable {

	private static final long serialVersionUID = 1L;
	
	public SortedSet<GrantedAuthority> sortAuthorities(Collection<? extends GrantedAuthority> authorities) {
		Assert.notNull(authorities, "Cannot pass a null GrantedAuthority collection");
		// Ensure array iteration order is predictable (as per
		// UserDetails.getAuthorities() contract and SEC-717)
		SortedSet<GrantedAuthority> sortedAuthorities = new TreeSet<>(this);
		for (GrantedAuthority grantedAuthority : authorities) {
			Assert.notNull(grantedAuthority, "GrantedAuthority list cannot contain any null elements");
			sortedAuthorities.add(grantedAuthority);
		}
		return sortedAuthorities;
	}
	@Override
	public int compare(GrantedAuthority g1, GrantedAuthority g2) {
		// Neither should ever be null as each entry is checked before adding it to
		// the set. If the authority is null, it is a custom authority and should
		// precede others.
		if (g2.getAuthority() == null) {
			return -1;
		}
		if (g1.getAuthority() == null) {
			return 1;
		}
		return g1.getAuthority().compareTo(g2.getAuthority());
	}

}